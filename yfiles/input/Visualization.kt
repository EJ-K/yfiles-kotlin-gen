// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration with different options on how to handle previews during a gesture.
 * @see [PortRelocationHandle]
 * @see [MoveLabelInputMode]
 * @see [LabelPositionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization">Online Documentation</a>
 */
external sealed class Visualization: YEnum<Visualization> {
   companion object: EnumMetadata<Visualization> {
       /**
 * No preview during the gesture, although some sort of visual feedback may be present.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23NONE">Online Documentation</a>
 */
val NONE: Visualization

/**
 * A primitive visualization is displayed during the gesture.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23GHOST">Online Documentation</a>
 */
val GHOST: Visualization

/**
 * A dummy item is displayed during the gesture, while the original one is hidden.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23DUMMY">Online Documentation</a>
 */
val DUMMY: Visualization

/**
 * The item is changed directly during the gesture.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Visualization%23LIVE">Online Documentation</a>
 */
val LIVE: Visualization
   }
}
