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
 * Available size change detection modes for the property [CanvasComponent.sizeChangedDetection].
 * @see [CanvasComponent.sizeChangedDetection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedDetectionMode">Online Documentation</a>
 */
external sealed class SizeChangedDetectionMode: YEnum<SizeChangedDetectionMode> {
   companion object: EnumMetadata<SizeChangedDetectionMode> {
       /**
 * No size change detection.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedDetectionMode%23NONE">Online Documentation</a>
 */
val NONE: SizeChangedDetectionMode

/**
 * Size change detection based on the native `ResizeObserver` API or invisible sensor elements.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedDetectionMode%23SENSOR">Online Documentation</a>
 */
val SENSOR: SizeChangedDetectionMode

/**
 * Timer based size change detection.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedDetectionMode%23TIMER">Online Documentation</a>
 */
val TIMER: SizeChangedDetectionMode

/**
 * This is the default mode which uses the preferred [SENSOR] mode if possible, otherwise the [TIMER] mode is used.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedDetectionMode%23AUTO">Online Documentation</a>
 */
val AUTO: SizeChangedDetectionMode
   }
}
