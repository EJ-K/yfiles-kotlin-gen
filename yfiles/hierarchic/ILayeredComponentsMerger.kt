// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject
import yfiles.layout.LayoutGraph

/**
 * This interface merges two [ILayers] instances whose nodes reside in the same graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayeredComponentsMerger">Online Documentation</a>
 */
external interface ILayeredComponentsMerger : YObject {
/**
 * Merges two [ILayers] instances.
 * @param [graph] the graph containing the nodes of source and target [ILayers] instances
 * @param [ldp] the [ILayoutDataProvider] used for querying the layer indices
 * @param [srcLayers] the source [ILayers] instance that will be merged into the target [ILayers] instance
 * @param [targetLayers] the [ILayers] instance that will be modified to contain the resulting layering
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILayeredComponentsMerger%23ILayeredComponentsMerger-method-merge">Online Documentation</a>
 */
   fun merge( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 srcLayers: ILayers ,
 targetLayers: ILayers )

companion object : InterfaceMetadata<ILayeredComponentsMerger> {
}
}
