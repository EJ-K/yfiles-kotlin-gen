// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow">Online Documentation</a>
 */
external sealed class EdgeFlow: YEnum<EdgeFlow> {
   companion object: EnumMetadata<EdgeFlow> {
       /**
 * Edge flow specifier that defines that there is no main flow direction.
 * 
 * Value - `-1`
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow%23NONE">Online Documentation</a>
 */
val NONE: EdgeFlow

/**
 * Edge flow specifier which defines that the flow direction of most edges is down.
 * 
 * Value - `0`
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow%23DOWN">Online Documentation</a>
 */
val DOWN: EdgeFlow

/**
 * Edge flow specifier which defines that the flow direction of most edges is right.
 * 
 * Value - `1`
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow%23RIGHT">Online Documentation</a>
 */
val RIGHT: EdgeFlow

/**
 * Edge flow specifier which defines that the flow direction of most edges is up.
 * 
 * Value - `2`
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow%23UP">Online Documentation</a>
 */
val UP: EdgeFlow

/**
 * Edge flow specifier which defines that the flow direction of most edges is left.
 * 
 * Value - `3`
 * @see [LayoutGraphUtilities.determineEdgeFlowDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeFlow%23LEFT">Online Documentation</a>
 */
val LEFT: EdgeFlow
   }
}
