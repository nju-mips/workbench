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
make run-cputests # run all cputests
make run-add      # run cputests-add
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
cd nju-mips

git clone git@github.com:nju-mips/rootfs
make -C rootfs

git clone git@github.com:nju-mips/u-boot
git clone git@github.com:nju-mips/linux
ARCH=mips make -C u-boot noop_emu_defconfig -j8
ARCH=mips make -C linux noop_emu_defconfig -j8

cd framework && make run-linux
```
