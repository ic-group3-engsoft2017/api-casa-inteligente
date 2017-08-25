#!/bin/bash

set -e

apt-get update

_install_mvn339() {
    echo "installing maven..."
    # wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
    # tar xzf apache-maven-3.3.9-bin.tar.gz
    # mv apache-maven-3.3.9 /opt/maven
    # ln -s /opt/maven/apache-maven-3.3.9/ maven
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
    git clone -b master https://e41cde3cc67e11b8b4f232aceeeff34512c7b795:x-oauth-basic@github.com/ic-group3-engsoft2017/api-casa-inteligente.git /home/app/casainteligente
    # e41cde3cc67e11b8b4f232aceeeff34512c7b795
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