package ru.vertenberger.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.vertenberger.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}
