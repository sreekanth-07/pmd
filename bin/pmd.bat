@echo on
set TOPDIR="%~dp0.."
set OPTS=
set MAIN_CLASS=net.sourceforge.pmd.PMD
echo %PMD_JAVA_OPTS%
echo "sreekanth"
java %PMD_JAVA_OPTS% -classpath %TOPDIR%\lib\* %OPTS% %MAIN_CLASS% %*
