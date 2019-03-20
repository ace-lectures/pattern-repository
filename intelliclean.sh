#!/usr/bin/env bash

 find . -name '*.iml' -exec rm -vf {} \;
 rm -rf .idea
 mvn -q clean
