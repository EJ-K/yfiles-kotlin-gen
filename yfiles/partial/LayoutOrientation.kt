// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see [PartialLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation">Online Documentation</a>
 */
@JsName("PartialLayoutOrientation")
external sealed class LayoutOrientation: YEnum<LayoutOrientation> {
   companion object: EnumMetadata<LayoutOrientation> {
       /**
 * Layout orientation specifier where the layout orientation is completely ignored.
 * 
 * Value - `-1`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23NONE">Online Documentation</a>
 */
val NONE: LayoutOrientation

/**
 * Layout orientation specifier which defines that the main layout orientation is from top to bottom.
 * 
 * Value - `0`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23TOP_TO_BOTTOM">Online Documentation</a>
 */
val TOP_TO_BOTTOM: LayoutOrientation

/**
 * Layout orientation specifier which defines that the main layout orientation is from left to right.
 * 
 * Value - `1`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23LEFT_TO_RIGHT">Online Documentation</a>
 */
val LEFT_TO_RIGHT: LayoutOrientation

/**
 * Layout orientation specifier which defines that the main layout orientation is from bottom to top.
 * 
 * Value - `2`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23BOTTOM_TO_TOP">Online Documentation</a>
 */
val BOTTOM_TO_TOP: LayoutOrientation

/**
 * Layout orientation specifier which defines that the main layout orientation is from right to left.
 * 
 * Value - `3`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23RIGHT_TO_LEFT">Online Documentation</a>
 */
val RIGHT_TO_LEFT: LayoutOrientation

/**
 * Layout orientation specifier where the orientation is automatically detected.
 * 
 * Value - `5`
 * @see [PartialLayout.layoutOrientation]
 * @see [ClearAreaLayout.layoutOrientation]
 * @see [FillAreaLayout.layoutOrientation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartialLayoutOrientation%23AUTO_DETECT">Online Documentation</a>
 */
val AUTO_DETECT: LayoutOrientation
   }
}
