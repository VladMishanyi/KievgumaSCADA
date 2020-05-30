package com.vk.exception;

public interface ExceptionMessage {

    String INCOMING_OBJECT_IS_NULL_MESSAGE = "Incoming object of the %s class is null!";

    String INCOMING_TYPE_IS_NULL_MESSAGE = "Incoming %s type is null!";

    String SAVING_OBJECT_IS_NULL_MESSAGE = "Saving object of the %s class is null!";

    String BLANK_DOMAIN_MESSAGE = "Incoming %s domain is null or empty!";

    String BLANK_TITLE_MESSAGE = "Incoming %s title is null or empty!";

    String BLANK_NAME_MESSAGE = "Incoming %s name is null or empty!";

    String BLANK_LOGIN_MESSAGE = "Incoming %s login is null or empty!";

    String BLANK_EMAIL_MESSAGE = "Incoming %s E-mail is null or empty!";

    String BLANK_PHONE_MESSAGE = "Incoming %s phone is null or empty!";

    String BLANK_URL_MESSAGE = "Incoming %s URL is null or empty!";

    String BLANK_NUMBER_MESSAGE = "Incoming %s number is null or empty!";

    String BLANK_CATEGORY_TITLE_MESSAGE = "Incoming category title is null or empty!";

    String FINDING_BY_ID_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming id \"%d\"!";

    String FINDING_BY_TITLE_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming title \"%s\"!";

    String FINDING_BY_URL_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming URL \"%s\"!";

    String FINDING_BY_NUMBER_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming number \"%s\"!";

    String FINDING_BY_NAME_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming name \"%s\"!";

    String FINDING_BY_LOGIN_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming login \"%s\"!";

    String FINDING_BY_EMAIL_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming E-mail \"%s\"!";

    String FINDING_BY_PHONE_OBJECT_IS_NULL_MESSAGE = "Can`t find a object of the %s class by the incoming phone \"%s\"!";

    String FORBIDDEN_STATIC_FILE_MESSAGE = "Static files are forbidden to remove!";

    String MULTIPART_FILE_IS_EMPTY_MESSAGE = "Incoming multipart file is null or empty!";

    String MAX_FILE_SIZE_MESSAGE = "Maximum file size must be no larger than %d bytes. " +
                    "Size of the incoming file is %d bytes!";

    String GET_METHOD_NOT_SUPPORTED_MESSAGE = "GET method in \"%s\" is not supported!";

    String ILLEGAL_ACCESS_MESSAGE =
            "You do not have sufficient permissions to access this page.";

    String UNSUPPORTED_OPERATION_MESSAGE = "Not supported by %s class!";
}
