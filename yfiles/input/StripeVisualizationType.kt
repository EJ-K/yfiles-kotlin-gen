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
 * Enumeration constants for the various visualization types used in conjunction with [IStripeInputVisualizationHelper]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeVisualizationType">Online Documentation</a>
 */
external sealed class StripeVisualizationType: YEnum<StripeVisualizationType> {
   companion object: EnumMetadata<StripeVisualizationType> {
       /**
 * A visualization for a selected stripe or stripe label.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeVisualizationType%23SELECTION">Online Documentation</a>
 */
val SELECTION: StripeVisualizationType

/**
 * A visualization for the source stripe of a reparent operation.
 * 
 * Value - `1`
 * @see [ReparentStripeInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeVisualizationType%23DRAG_SOURCE">Online Documentation</a>
 */
val DRAG_SOURCE: StripeVisualizationType

/**
 * A visualization for the target stripe of a reparent or drag and drop operation.
 * 
 * Value - `2`
 * @see [ReparentStripeInputMode]
 * @see [StripeDropInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeVisualizationType%23DROP_TARGET">Online Documentation</a>
 */
val DROP_TARGET: StripeVisualizationType

/**
 * A visualization for resize operations that are triggered for example by [ResizeStripeInputMode]
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeVisualizationType%23RESIZE">Online Documentation</a>
 */
val RESIZE: StripeVisualizationType
   }
}
