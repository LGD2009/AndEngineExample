#!/bin/bash

NDK_DIRECTORY="D:\\ndroid-sdk\\ndk\\20.0.5594570\\"
PROJECT_DIRECTORY="E:\\AndEngineLib\\AndEngineLibs\\AndEngineApp\\"

# Run build:
pushd ${PROJECT_DIRECTORY}
${NDK_DIRECTORY}\ndk-build.cmd

# Clean temporary files:
# rm -rf ${PROJECT_DIRECTORY}obj
# find . -name gdbserver -print0 | xargs -0 rm -rf
# find . -name gdb.setup -print0 | xargs -0 rm -rf
pause
popd
