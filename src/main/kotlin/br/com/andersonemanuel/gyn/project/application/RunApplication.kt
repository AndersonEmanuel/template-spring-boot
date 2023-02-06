package br.com.andersonemanuel.gyn.project.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RunApplication

fun main(args: Array<String>) {
	System.setProperty("java.util.PropertyResourceBundle.encoding", "UTF-8")

	runApplication<RunApplication>(*args)
}
