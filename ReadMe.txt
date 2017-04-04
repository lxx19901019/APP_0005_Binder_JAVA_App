(1)AIDL
1. 把IHelloService.aidl放入frameworks/base/core/java/android/os
2.修改frameworks/base/Android.mk
	core/java/android/os/ILedService.aidl \
	core/java/android/os/IHelloService.aidl \
3. mmm frameworks/base
4.它会生成 ./out/target/common/obj/JAVA_LIBRARIES/framework_intermediates/src/core/java/android/os/IHelloService.java
