# DJI SDK 5.18.0 Decompilation Summary

## Overview

Decompiled 4,877 Java files from DJI Mobile SDK V5 artifacts using CFR 0.152.

## Source Artifacts

- `dji-sdk-v5-aircraft-5.18.0.aar`
- `dji-sdk-v5-aircraft-provided-5.18.0.jar`
- `dji-sdk-v5-networkImp-5.18.0.aar`
- `wpmzsdk-1.0.5.0.aar`

The extracted `classes.jar` files from the AARs are kept beside the original artifacts for reference.

## Package Structure

- `dji.*` - DJI SDK V5 public API, key/value abstractions, managers, models, and internal implementation classes.
- `dji.v5.*` - V5-specific SDK interfaces and managers.
- `com.dji.*` - DJI supporting packages and implementation details.
- `djimrtc.*` - DJI media/RTC-related classes.
- `xcrash.*` - Crash handling support bundled in the SDK artifacts.

## Useful Entry Points

- `dji.v5.manager.SDKManager`
- `dji.v5.manager.KeyManager`
- `dji.v5.manager.aircraft.virtualstick.VirtualStickManager`
- `dji.sdk.keyvalue.key.CameraKey`
- `dji.sdk.keyvalue.key.FlightControllerKey`
- `dji.sdk.keyvalue.key.GimbalKey`
- `dji.sdk.keyvalue.value.*`

## Notes

As with the SDK V4 decompilation, this folder is for inspection and debugging only. Decompiled code can be incomplete or harder to read where DJI uses obfuscation, native libraries, or generated code.
