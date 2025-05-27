// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.lang.ClassMetadata

/**
 * A class that accepts a collection of objects from the [GraphBuilder] to build [IEdge][yfiles.graph.IEdge]s from.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource">Online Documentation</a>
 * 
 * @constructor Creates a new source with the given `edgeCreator`.
 * @param [edgeCreator] The creator that is used to create the edges of this source.
 * @param [sourceIdProvider] A function that yields a source node id for each element of the associated data collection in the [GraphBuilder].
 * @param [targetIdProvider] A function that yields a target node id for each element of the associated data collection in the [GraphBuilder].
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23EdgesSource-constructor-EdgesSource">Online Documentation</a>
 */
open external class EdgesSource<TDataItem> (
  edgeCreator: EdgeCreator<TDataItem>,
  sourceIdProvider: Provider<TDataItem, Any>,
  targetIdProvider: Provider<TDataItem, Any>,
  idProvider: IdProvider<TDataItem>  = definedExternally,
)  {
  /**
   * Gets or sets the [EdgeCreator] for this source, which can be used to adjust the creation behavior.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23edgeCreator">Online Documentation</a>
   */
  final var edgeCreator: EdgeCreator<TDataItem>
  
  /**
   * Gets or sets a provider that yields an id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23idProvider">Online Documentation</a>
   */
  final var idProvider: IdProvider<TDataItem>?
  
  /**
   * Gets the provider that yields a source node id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23sourceIdProvider">Online Documentation</a>
   */
  final val sourceIdProvider: Provider<TDataItem, Any>
  
  /**
   * Gets the provider that yields a target node id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23targetIdProvider">Online Documentation</a>
   */
  final val targetIdProvider: Provider<TDataItem, Any>
  
  /**
   * Obtains the source node id for each data item for which an edge is created.
   * @param [dataItem] A single data item from the associated data collection in the [GraphBuilder].
   * @return The source node id to which the [sourceIdProvider][EdgesSource] resolves with the data item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23EdgesSource-method-getSourceId">Online Documentation</a>
   */
  protected open fun getSourceId(
    dataItem: TDataItem,
  ): Any?
  
  /**
   * Obtains the target node id for each data item for which an edge is created.
   * @param [dataItem] A single data item from the associated data collection in the [GraphBuilder].
   * @return The target node id to which the [targetIdProvider][EdgesSource] resolves with the data item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgesSource%23EdgesSource-method-getTargetId">Online Documentation</a>
   */
  protected open fun getTargetId(
    dataItem: TDataItem,
  ): Any?
  
  companion object : ClassMetadata<EdgesSource<*>> {
  }
}
