using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNSimInfo
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNSimInfoModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNSimInfoModule"/>.
        /// </summary>
        internal RNSimInfoModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNSimInfo";
            }
        }
    }
}
