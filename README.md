# njumips workbench

## preparation
```
# workbench
mkdir nju-mips
cd nju-mips

# nemu-mips32
git clone git@github.com:nju-mips/nemu-mips32
make noop_defconfig
make

# framework
git clone git@github.com:nju-mips/framework
```

## run am tests
```
cd nju-mips
git clone git@github.com:nju-mips/nexus-am

cd framework
make run-microbench
make run-litenes
make run-coremark
make run-add # cputests-add
```

## run insttest and tlbtest
```
cd nju-mips
git clone git@github.com:nju-mips/insttest
git clone git@github.com:nju-mips/tlbtest

cd framework
make run-insttest
make run-tlbtest
```

## run linux
```
git clone git@github.com:nju-mips/u-boot
git clone git@github.com:nju-mips/linux
ARCH=mips make -C u-boot noop_defconfig
ARCH=mips make -C linux noop_defconfig
cd framework && make run-linux
```
