SUMMARY = "OS Metrics MQTT publisher written in Go"
HOMEPAGE = "https://gitlab.proatnedap.org/nimbus/vatis"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=cd311743c0d91e20d206532af9d2d313"

GO_IMPORT = "gitlab.proatnedap.org/nimbus/vatis"
SRC_URI = "git://git@${GO_IMPORT};protocol=ssh"

# Points to 0.1.0 tag
SRCREV = "1593283f6f612fc88931de88ab23233fffabca86"

inherit go

GO_INSTALL = "${GO_IMPORT}"

RDEPENDS_${PN}-dev += "bash"

do_configure() {
    ${GO} mod download
}

