// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * @see [PreferredPlacementDescriptor.sideReference]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSideReferences">Online Documentation</a>
 */
external class LabelSideReferences 
    private constructor(): YFlags<LabelSideReferences> {
    companion object {
    /**
 * Side placement specifier for edge labels which expresses that the preferred side of the edge is interpreted relative to the edge flow.
 * 
 * Value - `1`
 * @see [PreferredPlacementDescriptor.sideReference]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSideReferences%23RELATIVE_TO_EDGE_FLOW">Online Documentation</a>
 */
val RELATIVE_TO_EDGE_FLOW: LabelSideReferences
/**
 * Side placement specifier for edge labels which defines that the preferred side for the label is interpreted independently of the edge direction placing [left labels][LabelPlacements.LEFT_OF_EDGE] above horizontal segments.
 * 
 * Value - `2`
 * @see [PreferredPlacementDescriptor.sideReference]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSideReferences%23ABSOLUTE_WITH_LEFT_IN_NORTH">Online Documentation</a>
 */
val ABSOLUTE_WITH_LEFT_IN_NORTH: LabelSideReferences
/**
 * Side placement specifier for edge labels which defines that the preferred side for the label is interpreted independently of the edge direction placing [left labels][LabelPlacements.RIGHT_OF_EDGE] above horizontal segments.
 * 
 * Value - `4`
 * @see [PreferredPlacementDescriptor.sideReference]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelSideReferences%23ABSOLUTE_WITH_RIGHT_IN_NORTH">Online Documentation</a>
 */
val ABSOLUTE_WITH_RIGHT_IN_NORTH: LabelSideReferences

    }
}
