package com.BUS;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@SpringBootApplication(scanBasePackages = {"com.BUS"},exclude = {MultipartAutoConfiguration.class})
@RestController
@MapperScan("com.BUS.Dao")
//排除原有的Multipart配置

public class BUSApplication {
	@RequestMapping(value = "/message")
	public String wxmessage(String signature, String timestamp, String nonce, String echostr) {

		String token = "wykbjdy999";
		String aesKey = "hmMh6H5Ubp1fJkEItJT9ABywRUge8kUl0hb7UYk7aRP";
		System.out.println("进入了token验证接口");

        /*
        1.将token、timestamp、nonce三个参数进行字典序排序
        2.将三个参数字符串拼接成一个字符串进行sha1加密
        3.开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
        */
		String[] strarr = {token,timestamp,nonce};
		Arrays.sort(strarr);
		StringBuilder sb = new StringBuilder();
		for (String str : strarr) {
			sb.append(str);
		}

		String laststring = sb.toString();

		String checksign = this.sha1(laststring);

		if (checksign != null && checksign.equals(signature)) {
			return echostr;
		}

		return "Error";
	}

	private String sha1(String str) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			digest.update(str.getBytes());
			byte messageDigest[] = digest.digest();
			// 创建 16进制字符串
			StringBuffer hexString = new StringBuffer();
			// 字节数组转换为 十六进制 数
			for (int i = 0; i < messageDigest.length; i++) {
				String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexString.append(0);
				}
				hexString.append(shaHex);
			}
			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}


	public static void main(String[] args) {
		SpringApplication.run(BUSApplication.class, args);
	}
}
