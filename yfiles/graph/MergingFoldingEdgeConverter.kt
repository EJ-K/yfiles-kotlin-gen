// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * An [IFoldingEdgeConverter] implementation that makes the [view][IFoldingView] contain at most one folding edge between each pair of nodes by letting a single folding edge represent all master edges.
 * @see [FoldingManager.foldingEdgeConverter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MergingFoldingEdgeConverter] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-constructor-MergingFoldingEdgeConverter">Online Documentation</a>
 */
external open class MergingFoldingEdgeConverter  () : FoldingEdgeConverterBase {

/**
 * Gets or sets a value indicating whether edge direction should be ignored for the determination of the [existing folding edges][IFoldingEdgeFactory.getExistingFoldingEdges].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23ignoreEdgeDirection">Online Documentation</a>
 */
final var ignoreEdgeDirection: Boolean
/**
 * Adds the first separate edge to the source and target node pair using the [IFoldingEdgeFactory.addAsSeparateEdge] method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-addFirstSeparateEdge">Online Documentation</a>
 */
 open protected   fun addFirstSeparateEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 viewSourceNode: INode ,
 sourceIsCollapsed: Boolean ,
 targetSourceNode: INode ,
 targetIsCollapsed: Boolean ):IEdge
/**
 * Tries to add the folding edge to an [existing][IFoldingEdgeFactory.getExistingFoldingEdges] folding edge, considering the [ignoreEdgeDirection] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MergingFoldingEdgeConverter%23MergingFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
 */
 override   fun addFoldingEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 source: INode ,
 sourceIsCollapsed: Boolean ,
 target: INode ,
 targetIsCollapsed: Boolean ):IEdge?

companion object : ClassMetadata<MergingFoldingEdgeConverter> {
}
}

inline fun MergingFoldingEdgeConverter(
    block: MergingFoldingEdgeConverter.() -> Unit
): MergingFoldingEdgeConverter {
    return MergingFoldingEdgeConverter()
        .apply(block)
}
