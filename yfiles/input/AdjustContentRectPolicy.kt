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
 * Policy to determine how the [content rectangle][yfiles.view.CanvasComponent.contentRect] of the [GraphComponent][yfiles.view.GraphComponent] should be recalculated after interactive graph changes.
 * @see [GraphEditorInputMode.adjustContentRectPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjustContentRectPolicy">Online Documentation</a>
 */
external sealed class AdjustContentRectPolicy: YEnum<AdjustContentRectPolicy> {
   companion object: EnumMetadata<AdjustContentRectPolicy> {
       /**
 * The content rectangle is not adjusted automatically after interactive changes.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjustContentRectPolicy%23NEVER">Online Documentation</a>
 */
val NEVER: AdjustContentRectPolicy

/**
 * The new content rectangle is recalculated with the union of the previous content rectangle and the new [bounds of the graph][yfiles.view.GraphComponent.fitGraphBounds].
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjustContentRectPolicy%23UNION">Online Documentation</a>
 */
val UNION: AdjustContentRectPolicy

/**
 * The new content rectangle is recalculated with the new [bounds of the graph][yfiles.view.GraphComponent.fitGraphBounds].
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjustContentRectPolicy%23ALWAYS">Online Documentation</a>
 */
val ALWAYS: AdjustContentRectPolicy
   }
}
