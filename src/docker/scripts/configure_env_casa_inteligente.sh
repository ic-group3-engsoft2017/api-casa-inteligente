#!/bin/bash

set -e

apt-get update

_install_mvn339() {
    echo "installing maven..."
    apt-get install -y maven
    echo "maven installed"
}

_install_git() {
    echo "installing git..."
    apt-get install -y git
    echo "git was installed"
}


_cloning_git_repos() {
    echo "cloning a repository..."
    mkdir -p /home/casainteligente
    git clone -b master https://{user_auth_token}:x-oauth-basic@github.com/ic-group3-engsoft2017/api-casa-inteligente.git /home/app/casainteligente
    echo "repository was cloned"
}

_clean_install_app() {
    echo "Building app..."
    cd /home/app/casainteligente
    mvn clean install
}

time _install_mvn339;
time _install_git;
time _cloning_git_repos;
time _clean_install_app;
