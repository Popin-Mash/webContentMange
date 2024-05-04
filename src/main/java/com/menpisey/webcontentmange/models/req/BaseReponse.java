package com.menpisey.webcontentmange.models.req;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseReponse {
    private String message;
    private String messageKh;
    private String status;
    private Object data;
}
