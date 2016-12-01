/**
 * Copyright (c) 2016-present JET BRIDGE LLC.
 * All rights reserved.
 *
 * This source code is licensed under the MIT-style license found in the
 * LICENSE file in the root directory of this source tree.
 */

'use strict';

let bb_native = require('react-native').NativeModules.A380;
let A380 = {
  init(aServerAddr, aVersion) {
    return bb_native.init(aServerAddr, aVersion);
  },

  checkUpdate(aAppKey, aSucc, aFail) {
    bb_native.checkUpdate(aAppKey, aSucc, aFail);
  },

  update(aAppKey, aSucc, aFail) {
    bb_native.update(aAppKey, aSucc, aFail);
  },

  silentUpdate(aAppKey) {
    bb_native.silentUpdate(aAppKey, aSucc, aFail);
  }
}

module.exports = A380;
