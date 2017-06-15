
// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_pages/core/background/request_notifier.h

package org.chromium.components.offlinepages;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    BackgroundSavePageResult.SUCCESS, BackgroundSavePageResult.LOADING_FAILURE,
    BackgroundSavePageResult.LOADING_CANCELED, BackgroundSavePageResult.FOREGROUND_CANCELED,
    BackgroundSavePageResult.SAVE_FAILED, BackgroundSavePageResult.EXPIRED,
    BackgroundSavePageResult.RETRY_COUNT_EXCEEDED, BackgroundSavePageResult.START_COUNT_EXCEEDED,
    BackgroundSavePageResult.USER_CANCELED, BackgroundSavePageResult.STATUS_COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface BackgroundSavePageResult {
  int SUCCESS = 0;
  int LOADING_FAILURE = 1;
  int LOADING_CANCELED = 2;
  int FOREGROUND_CANCELED = 3;
  int SAVE_FAILED = 4;
  int EXPIRED = 5;
  int RETRY_COUNT_EXCEEDED = 6;
  int START_COUNT_EXCEEDED = 7;
  int USER_CANCELED = 8;
  /**
   * NOTE: insert new values above this line and update histogram enum too.
   */
  int STATUS_COUNT = 9;
}