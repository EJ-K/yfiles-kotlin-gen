// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * [MinimumNodeSizeStage] enforces a given minimum width/height of the nodes of a graph during the layout process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage">Online Documentation</a>
 * 
 * @constructor Creates a new [MinimumNodeSizeStage] instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage%23MinimumNodeSizeStage-constructor-MinimumNodeSizeStage(ILayoutAlgorithm)">Online Documentation</a>
 */
external open class MinimumNodeSizeStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {
/**
 * Creates a new [MinimumNodeSizeStage] instance using the given [core layout algorithm][LayoutStageBase.coreLayout] along with a specific minimum width and height for the nodes.
 * @param [coreLayout] the core layout routine
 * @param [minWidth] the minimum width of nodes that should be enforced
 * @param [minHeight] the minimum height of nodes that should be enforced
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage%23MinimumNodeSizeStage-constructor-MinimumNodeSizeStage(ILayoutAlgorithm,number,number)">Online Documentation</a>
 */
 constructor( coreLayout: ILayoutAlgorithm? ,
 minWidth: Double ,
 minHeight: Double )

/**
 * Resizes all nodes that are smaller than the specified minimum size to that minimum size, executes the [core layout algorithm][LayoutStageBase.coreLayout] and restores the original sizes afterwards.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MinimumNodeSizeStage%23MinimumNodeSizeStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<MinimumNodeSizeStage> {
}
}
