echo ">>> Do you want to install softwares using Snap?\nEnter YES to install"
read install_using_snap
if [ -z $install_using_snap ]
then
  echo "NO"
else
  if [ $install_using_snap = "YES" ]
  then
    echo "YES"
    echo "Installing..."
  else
    echo "NO"
  fi
fi

echo ">>> Pin favourite applications on docker"
if [ $install_using_snap = "YES" ]
then
  echo "Snap applications pinned"
else
  echo "No snap applications pinned"
fi
