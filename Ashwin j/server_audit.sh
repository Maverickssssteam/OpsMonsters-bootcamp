#!/bin/bash

echo "========== SERVER AUDIT =========="

echo
echo "Hostname:"
hostname

echo
echo "Current User:"
whoami

echo
echo "Date:"
date

echo
echo "Uptime:"
uptime

echo
echo "CPU:"
lscpu | grep "Model name"

echo
echo "Memory:"
free -h

echo
echo "Disk:"
df -h

echo
echo "Top Memory Processes:"
ps aux --sort=-%mem | head -6

echo
echo "Listening Ports:"
ss -tuln

echo
echo "Logged-in Users:"
who

echo
echo "=================================="
