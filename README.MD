Purpose
=======

The purpose of this project is to see if we can create a test project that can capture a screenshot of a javafx app. 
Following components are included: 
* A javaFX app that will write a .png to a temporary file and that will check this file. 
* A docker image based on alpine and java8, that will run this code 
* A sacrifice to the X11 - gods, so they will spare me of their wrath by trying to bypass their teachings

The JavaFX code
=======
* Create a hello world app
* Create an image in the temp folder
* Print the absolute path to the image
* Use display /temp/path-to-test to check the image

The Docker Image
================
The first dockerfile creates an openjdk8 image that installs openjfx and runs the test application.
You can fetch the image that has been created with the following steps in the terminal

* Open a terminal 
* cd to the path where you want to load the files to
* find the docker ID bt using docker ps
* Use  docker cp <DOCKERID>:/tmp . to copy the whole /tmp folder to the host

## Alpine dependency list
(1/98) Installing sdl2 (2.0.9-r0)
(2/98) Installing expat (2.2.6-r0)
(3/98) Installing libuuid (2.33-r0)
(4/98) Installing fontconfig (2.13.1-r0)
(5/98) Installing fribidi (1.0.5-r0)
(6/98) Installing libass (0.14.0-r0)
(7/98) Installing gmp (6.1.2-r1)
(8/98) Installing nettle (3.4.1-r0)
(9/98) Installing libunistring (0.9.10-r0)
(10/98) Installing gnutls (3.6.7-r0)
(11/98) Installing ncurses-terminfo-base (6.1_p20190105-r0)
(12/98) Installing ncurses-terminfo (6.1_p20190105-r0)
(13/98) Installing ncurses-libs (6.1_p20190105-r0)
(14/98) Installing lame (3.100-r0)
(15/98) Installing opus (1.3-r0)
(16/98) Installing libogg (1.3.3-r2)
(17/98) Installing libtheora (1.1.1-r13)
(18/98) Installing v4l-utils-libs (1.16.2-r0)
(19/98) Installing libxfixes (5.0.3-r2)
(20/98) Installing libpciaccess (0.14-r0)
(21/98) Installing libdrm (2.4.96-r0)
(22/98) Installing libva (2.2.0-r0)
(23/98) Installing libvdpau (1.1.1-r2)
(24/98) Installing libvorbis (1.3.6-r2)
(25/98) Installing libvpx (1.6.1-r1)
(26/98) Installing x264-libs (20180304-r1)
(27/98) Installing x265-libs (2.8-r1)
(28/98) Installing xvidcore (1.3.4-r1)
(29/98) Installing ffmpeg-libs (4.0.2-r0)
(30/98) Installing ffmpeg (4.0.2-r0)
(31/98) Installing libintl (0.19.8.1-r4)
(32/98) Installing libblkid (2.33-r0)
(33/98) Installing libmount (2.33-r0)
(34/98) Installing pcre (8.42-r1)
(35/98) Installing glib (2.58.1-r2)
(36/98) Installing gstreamer (1.14.4-r0)
(37/98) Installing dbus-libs (1.10.24-r1)
(38/98) Installing icu-libs (62.1-r0)
(39/98) Installing libpcre2-16 (10.32-r1)
(40/98) Installing qt5-qtbase (5.12.0-r0)
(41/98) Installing wayland-libs-server (1.16.0-r0)
(42/98) Installing mesa-gbm (18.1.7-r2)
(43/98) Installing mesa-glapi (18.1.7-r2)
(44/98) Installing wayland-libs-client (1.16.0-r0)
(45/98) Installing libxshmfence (1.3-r0)
(46/98) Installing mesa-egl (18.1.7-r2)
(47/98) Installing libxdamage (1.1.4-r2)
(48/98) Installing libxxf86vm (1.1.4-r2)
(49/98) Installing mesa-gl (18.1.7-r2)
(50/98) Installing atk (2.30.0-r0)
(51/98) Installing pixman (0.34.0-r6)
(52/98) Installing cairo (1.16.0-r1)
(53/98) Installing aspell-libs (0.60.6.1-r13)
(54/98) Installing readline (7.0.003-r1)
(55/98) Installing hunspell (1.6.2-r1)
(56/98) Installing enchant (1.6.0-r13)
(57/98) Installing libgpg-error (1.33-r0)
(58/98) Installing libgcrypt (1.8.4-r0)
(59/98) Installing libxml2 (2.9.9-r1)
(60/98) Installing shared-mime-info (1.10-r0)
(61/98) Installing hicolor-icon-theme (0.17-r0)
(62/98) Installing tiff (4.0.10-r0)
(63/98) Installing gdk-pixbuf (2.36.11-r2)
(64/98) Installing gtk-update-icon-cache (2.24.32-r1)
(65/98) Installing libxcursor (1.1.15-r1)
(66/98) Installing libxinerama (1.1.4-r1)
(67/98) Installing libxrandr (1.5.1-r2)
(68/98) Installing at-spi2-core (2.28.0-r0)
(69/98) Installing at-spi2-atk (2.26.2-r0)
(70/98) Installing cairo-gobject (1.16.0-r1)
(71/98) Installing avahi-libs (0.7-r1)
(72/98) Installing cups-libs (2.2.10-r0)
(73/98) Installing libepoxy (1.5.3-r0)
(74/98) Installing graphite2 (1.3.12-r1)
(75/98) Installing harfbuzz (2.2.0-r0)
(76/98) Installing libxft (2.3.2-r3)
(77/98) Installing pango (1.42.4-r0)
(78/98) Installing wayland-libs-cursor (1.16.0-r0)
(79/98) Installing wayland-libs-egl (1.16.0-r0)
(80/98) Installing libxkbcommon (0.8.2-r0)
(81/98) Installing gtk+3.0 (3.24.1-r0)
(82/98) Installing libxv (1.0.11-r2)
(83/98) Installing cdparanoia-libs (10.2-r7)
(84/98) Installing orc (0.4.28-r0)
(85/98) Installing gst-plugins-base (1.14.4-r0)
(86/98) Installing harfbuzz-icu (2.2.0-r0)
(87/98) Installing hyphen (2.8.8-r1)
(88/98) Installing libnotify (0.7.7-r2)
(89/98) Installing libsecret (0.18.6-r0)
(90/98) Installing libproxy (0.4.15-r1)
(91/98) Installing glib-networking (2.56.1-r0)
(92/98) Installing libpsl (0.20.2-r1)
(93/98) Installing libsoup (2.64.1-r0)
(94/98) Installing libwebp (1.0.1-r0)
(95/98) Installing libxslt (1.1.32-r0)
(96/98) Installing webkit2gtk (2.22.7-r0)
(97/98) Installing gtk+2.0 (2.24.32-r1)
(98/98) Installing java-openjfx (8.151.12-r0)
