#! /bin/sh

NDK_DIRECTORY="H:\\Android\\android-ndk-r16b\\"
PROJECT_DIRECTORY="H:\\workspace\\as_workspaces\\AndEnginePhysicsBox2DExtension-GLES2\\"

# Run build:
cd ${PROJECT_DIRECTORY}
${NDK_DIRECTORY}ndk-build.cmd

# Clean temporary files:
rm -rf ${PROJECT_DIRECTORY}obj
find . -name gdbserver -print0 | xargs -0 rm -rf
find . -name gdb.setup -print0 | xargs -0 rm -rf