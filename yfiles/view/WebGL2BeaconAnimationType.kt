// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Defines types of beacon fade animations for use with the [WebGL2GraphModelManager.createBeaconAnimation] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconAnimationType">Online Documentation</a>
 */
external sealed class WebGL2BeaconAnimationType: YEnum<WebGL2BeaconAnimationType> {
   companion object: EnumMetadata<WebGL2BeaconAnimationType> {
       /**
 * Fade out across maximum extent
 * 
 * Value - `18`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconAnimationType%23FADE">Online Documentation</a>
 */
val FADE: WebGL2BeaconAnimationType

/**
 * Constant beacon transparency, only slightly fades in/out at the extreme values, but stays constant in between.
 * 
 * Value - `20`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconAnimationType%23NO_FADE">Online Documentation</a>
 */
val NO_FADE: WebGL2BeaconAnimationType

/**
 * Fade in beacon starting from a transparent center to fully opaque near the maximum extent.
 * 
 * Value - `22`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WebGL2BeaconAnimationType%23REVERSE_FADE">Online Documentation</a>
 */
val REVERSE_FADE: WebGL2BeaconAnimationType
   }
}
