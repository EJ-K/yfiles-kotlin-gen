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
 * The default implementation of the [IFoldingEdgeConverter] that is used by the [FoldingManager] initially and can be customized to suit the application's needs.
 * @see [FoldingEdgeConverterBase]
 * @see [reuseMasterPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFoldingEdgeConverter">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of this class with default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFoldingEdgeConverter%23DefaultFoldingEdgeConverter-constructor-DefaultFoldingEdgeConverter">Online Documentation</a>
 */
external open class DefaultFoldingEdgeConverter  () : FoldingEdgeConverterBase {

/**
 * Gets or sets a property that determines whether this implementation should reuse the ports of [folder][IFoldingView.isInFoldingState] nodes for the folding edges.
 * @see [reuseMasterPorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFoldingEdgeConverter%23reuseFolderNodePorts">Online Documentation</a>
 */
final var reuseFolderNodePorts: Boolean
/**
 * Gets or sets a property that determines whether this implementation should reuse the ports of the [FoldingManager.masterGraph] at non-[folder][IFoldingView.isInFoldingState] nodes for the folding edges.
 * @see [reuseFolderNodePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFoldingEdgeConverter%23reuseMasterPorts">Online Documentation</a>
 */
final var reuseMasterPorts: Boolean
/**
 * Actually adds the folding edge as a [separate edge][IFoldingEdgeFactory.addAsSeparateEdge] to the view, reusing existing [view][IFoldingView.getViewItem] ports of the original source and target port, if [reuseMasterPorts] is enabled and that is possible for the given edge.
 * @param [factory] The [IFoldingEdgeFactory] implementation.
 * @param [foldingView] The instance into which the folding edge is going to be inserted.
 * @param [masterEdge] The edge from the [FoldingManager.masterGraph] that needs to be represented by a folding edge.
 * @param [source] The source node that belongs to the [IFoldingView] graph that will act as the local view node of the actual source node.
 * @param [sourceIsCollapsed] Determines whether the `source` is currently a folder node.
 * @param [target] The target node that belongs to the [IFoldingView] graph that will act as the local view node of the actual target node.
 * @param [targetIsCollapsed] Determines whether the `target` is currently a folder node.
 * @return The edge as returned by the call to [IFoldingEdgeFactory.addAsSeparateEdge].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultFoldingEdgeConverter%23DefaultFoldingEdgeConverter-method-addFoldingEdge">Online Documentation</a>
 */
 override   fun addFoldingEdge( factory: IFoldingEdgeFactory ,
 foldingView: IFoldingView ,
 masterEdge: IEdge ,
 source: INode ,
 sourceIsCollapsed: Boolean ,
 target: INode ,
 targetIsCollapsed: Boolean ):IEdge?

companion object : ClassMetadata<DefaultFoldingEdgeConverter> {
}
}

inline fun DefaultFoldingEdgeConverter(
    block: DefaultFoldingEdgeConverter.() -> Unit
): DefaultFoldingEdgeConverter {
    return DefaultFoldingEdgeConverter()
        .apply(block)
}
