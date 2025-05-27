// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.InterfaceMetadata

/**
 * A [IFromSketchNodePlacer] arranges the subtrees while taking the initial locations of the nodes into account.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFromSketchNodePlacer">Online Documentation</a>
 */
external interface IFromSketchNodePlacer : INodePlacer {
/**
 * Creates an edge [IComparer] which takes the initial coordinates of the nodes into account.
 * @return the [IComparer] for the edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFromSketchNodePlacer%23IFromSketchNodePlacer-method-createFromSketchComparer">Online Documentation</a>
 */
   fun createFromSketchComparer():IComparer<Node>

companion object : InterfaceMetadata<IFromSketchNodePlacer> {
}
}
