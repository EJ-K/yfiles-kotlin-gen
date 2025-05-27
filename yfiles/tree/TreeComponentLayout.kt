// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph

/**
 * The [TreeComponentLayout] arranges tree-like subgraph structures in a mixed layout style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [TreeComponentLayout] instance using the specified layouter for arranging the subtrees.
 * @param [coreLayout] the layout algorithm used for arranging the tree components
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23TreeComponentLayout-constructor-TreeComponentLayout">Online Documentation</a>
 */
external open class TreeComponentLayout  ( coreLayout: ILayoutAlgorithm  = definedExternally) : ILayoutStage {

/**
 * Gets or sets whether or not *undirected* tree sub-graphs should be detected and handled.
 * 
 * Default value - `false`. Only directed subtrees are handled
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23considerUndirectedTrees">Online Documentation</a>
 */
open var considerUndirectedTrees: Boolean
/**
 * Gets or sets the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Gets or sets whether or not tree component arrangement is improved by changing the orientation of components.
 * 
 * Default value - `false`. Components keep their orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23optimizeOrientation">Online Documentation</a>
 */
open var optimizeOrientation: Boolean
/**
 * Gets or sets the layout algorithm that is applied to tree components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23treeComponentCoreLayout">Online Documentation</a>
 */
open var treeComponentCoreLayout: ILayoutAlgorithm
/**
 * Finds the tree components inside the given graph and applies a [tree layout][treeComponentCoreLayout] to them.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23TreeComponentLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Delegates the layout calculation to the [core layout algorithm][coreLayout] and handles the dummy nodes.
 * @param [graph] the input graph
 * @param [dummyDp] the [IDataProvider] which marks the dummy nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23TreeComponentLayout-method-applyLayoutUsingDummies">Online Documentation</a>
 */
 open protected   fun applyLayoutUsingDummies( graph: LayoutGraph ,
 dummyDp: IDataProvider<Node, Boolean> )

companion object : ClassMetadata<TreeComponentLayout> {
/**
 * A data provider key for identifying dummy nodes during the layout calculation.
 * @see [applyLayoutUsingDummies]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeComponentLayout%23DUMMY_NODE_DP_KEY">Online Documentation</a>
 */
 val DUMMY_NODE_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun TreeComponentLayout(
    block: TreeComponentLayout.() -> Unit
): TreeComponentLayout {
    return TreeComponentLayout()
        .apply(block)
}
