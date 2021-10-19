DESCRIPTION = " \
               Device YIoT application \
               "

LICENSE = "BSD-2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7e982f4ba24a610f601244121b1a1df8"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/YIoT-team/yiot-apps.git;branch=develop;protocol=http"
SRCREV = "26797db05d0f7f0e652d17aba8dca69917213faf"

S = "${WORKDIR}/git"

inherit pkgconfig cmake_qt5

EXTRA_OECMAKE = "-DTARGET:STRING=yiot"
EXTRA_OECMAKE = "-GNinja"
EXTRA_OECMAKE = "-DCMAKE_BUILD_TYPE:String=Debug"
EXTRA_OECMAKE = "-DQT_QMAKE_EXECUTABLE:STRING=%{Qt:qmakeExecutable}"
EXTRA_OECMAKE = "-DCMAKE_PREFIX_PATH:STRING=%{Qt:QT_INSTALL_PREFIX}"
EXTRA_OECMAKE = "-DCMAKE_C_COMPILER:STRING=%{Compiler:Executable:C}"
EXTRA_OECMAKE = "-DCMAKE_CXX_COMPILER:STRING=%{Compiler:Executable:Cxx}"
