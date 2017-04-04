#²Î¿¼D:frameworks\base\cmds\am\Android.mk
LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := HelloService.java  IHelloService.java TestServer.java
LOCAL_MODULE := test_server

include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := HelloService.java  IHelloService.java TestClient.java
LOCAL_MODULE := test_client

include $(BUILD_JAVA_LIBRARY)

