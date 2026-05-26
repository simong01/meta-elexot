# This image extends core-image with additional
# Elexontech packages

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += " \
    atinout \
    can-utils \
    curl \
    e2fsprogs \
    ethtool \
    evtest \
    fw-env-rules \
    firmwared \
    i2c-tools \
    iperf3 \
    iproute2 \
    iw \
    kernel-tools-iio \
    kernel-tools-pci \
    libgpiod \
    libgpiod-tools \
    memtester \
    minicom \
    mmc-utils \
    modemmanager \
    networkmanager \
    networkmanager-nmcli \
    openssh \
    packagegroup-tools-bluetooth \
    pciutils \
    screen \
    spidev-test \
    spitools \
    strace \
    u-boot-elexot-env \
    u-boot-fw-utils \
    udev-rules-imx \
    v4l-utils \
    wireless-regdb-static \
"
