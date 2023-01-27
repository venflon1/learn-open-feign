package com.acn.learnopenfeign.service.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.acn.learnopenfeign.dto.UserDTO;

@Component
@FeignClient(
	name = "${external.user-service-client.name}",
	url = "${external.user-service-client.domain-url}"
)
public interface UserServiceClient {
	@GetMapping(path = "${external.user-service-client.retrieve-user.url}")
	UserDTO getUserByUserId(@PathVariable(name = "userId") String id);
}