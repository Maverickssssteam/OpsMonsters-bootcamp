#!/bin/bash








disk=`df -h | grep "/dev/nvme0n1p6" | awk '{print $5}' | sed 's|%| |g'`




if [ "$disk" -lt 60 ]
then
	echo "Disk storage is $disk% , Its normal"
elif [ "$disk" -lt 80 ]
then
	echo "Disk storage is $disk% , Warning"
elif [ "$disk" -lt 90 ]
then
	echo "Disk storage is $disk% , Its critical"
else
	echo "Disk storage is $disk% , Its on Risk"
fi

