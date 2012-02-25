DESCRIPTION = "LCN scanner for DVB-T services"
DEPENDS = "enigma2 python"
LICENSE = "GPLv2"

inherit gitpkgv

PV = "1.0-git${SRCPV}"
PKGV = "1.0-git${GITPKGV}"
PR = "r2"
SRCREV = "${AUTOREV}" 

SRC_URI="git://openee.git.sourceforge.net/gitroot/openee/lcnscanner;protocol=git"
S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_install() {
	oe_runmake 'D=${D}' install
}
