REM This cmd file will try to pull, rebase, and push until it succeeds, while sleeping for X minutes between failed attempts.
REM Ideal for pushing to soon-to-melt frozen branches while enjoying sushi for lunch.
REM Before the first use, please configure the PERSONALIZED SETTINGS section below:

setlocal

REM ********** PERSONALIZED SETTINGS - START
set localGitRepositoryPath=C:\Users\vaingato\Workspace\hpe-demo-app
set minutesToWaitBetweenAttempts=5
REM ********** PERSONALIZED SETTINGS - END

set codeVersion=1.0.4
set echoPrefix=GitNagPush:
set counter=0;
@echo off
color 0f
cls
@echo -------------------------------
@echo GitNagPush v%codeVersion% by Uri Kalish
@echo -------------------------------
echo %echoPrefix% Changing directory to %localGitRepositoryPath%...
cd %localGitRepositoryPath%
echo %echoPrefix% CD OK
echo %echoPrefix% Minutes between attempts: %minutesToWaitBetweenAttempts%
set /a secondsToWaitBetweenAttempts=minutesToWaitBetweenAttempts*60

:loopstart
@echo -------------------------------
set /a counter=counter+1
echo %echoPrefix% Attempt #%counter%

:pull
echo %echoPrefix% Attempting Pull-Rebase...
git pull origin tests
if errorlevel 1 goto pullerror
goto pullsuccess
:pullerror
echo %echoPrefix% Pull ERROR
color 0c
goto :end
:pullsuccess
echo %echoPrefix% Pull OK
:pullend

:commit
echo %echoPrefix% Attempting to commit a new change...
echo. 2>changes.txt
git add .
git commit -m "new change"
if errorlevel 1 goto commiterror
goto commitsuccess
:commiterror
echo %echoPrefix% Push ERROR
color 0e
goto :pushend
:commitsuccess
color 0a
echo %echoPrefix% Commit OK
goto :end

:push
echo %echoPrefix% Attempting Push...
git push origin tests
if errorlevel 1 goto pusherror
goto pushsuccess
:pusherror
echo %echoPrefix% Push ERROR
color 0e
goto :pushend
:pushsuccess
color 0a
echo %echoPrefix% Push OK
goto :end
:pushend

:wait
timeout /t %secondsToWaitBetweenAttempts% 

:loopend
goto :loopstart

:end
pause