#!/bin/bash
set -e

echo "Pull latest code..."
git pull

echo "Run Docker..."
docker-compose down
docker-compose up -d --build