# Copyright 2021 - 2022, Synaptics Incorporated

DESCRIPTION = "Linux Kernel firmware for Synaptics bcm43711"
SECTION = "kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${STAGING_KERNEL_DIR}/COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = "git://github.com/synaptics-astra/linux_6_12-main.git;protocol=https;branch=scarthgap_6.12_v2.4.0;subpath=firmware/bcm"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}"

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_populate_lic[depends] += " \
    virtual/kernel:do_shared_workdir \
"
do_install[depends] += " \
    virtual/kernel:do_shared_workdir \
"

do_install() {
    install -d ${D}${nonarch_base_libdir}/firmware
    install -m 0644 ${S}/bcm/fw_sd_bcm43711.bin ${D}${nonarch_base_libdir}/firmware/
    install -m 0644 ${S}/bcm/bcmdhd_sd_43711.cal ${D}${nonarch_base_libdir}/firmware/
    install -m 0644 ${S}/bcm/bcmdhd_clm_43711.blob ${D}${nonarch_base_libdir}/firmware/
}

FILES:${PN} = " \
    ${nonarch_base_libdir} \
"
