# This recipe builds a kernel module that would allow
# to apply a devicetree overlay dynamically from userspace.
# At the time of writing following implementation is still not merged in
# current linux-imx kernel
# - CONFIG_OF_CONFIGFS=y
# Supposedly it's a more elegant implementation than
# https://github.com/raspberrypi/userland/blob/master/host_applications/linux/apps/dtoverlay/dtoverlay_main.c

SUMMARY = "Device Tree Blob Overlay Configuration File System"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-2-Clause;md5=cb641bc04cda31daea161b1bc15da69f"

inherit module

PR = "r1"
PV = "0.1"

SRC_SHA = "d3cea0fea5a59e2b0805f3d17cf33e83dac2c00f"
SRC_URI = " \
    git://github.com/ikwzm/dtbocfg.git;rev=${SRC_SHA};branch=master;protocol=https \
"

S = "${WORKDIR}/git"
