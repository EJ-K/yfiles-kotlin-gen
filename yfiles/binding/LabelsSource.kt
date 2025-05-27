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
 * A class that accepts a collection of objects from the [NodeCreator] or [EdgeCreator] to build [ILabel][yfiles.graph.ILabel]s from.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelsSource">Online Documentation</a>
 * 
 * @constructor Creates a new source with the given `labelCreator`.
 * @param [labelCreator] The creator that is used to create the edges of this source.
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [GraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelsSource%23LabelsSource-constructor-LabelsSource">Online Documentation</a>
 */
external class LabelsSource<TDataItem> (
  labelCreator: LabelCreator<TDataItem>,
  idProvider: IdProvider<TDataItem>  = definedExternally,
)  {
  /**
   * Gets or sets a provider that yields an id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelsSource%23idProvider">Online Documentation</a>
   */
  final var idProvider: IdProvider<TDataItem>?
  
  /**
   * Gets or sets the [LabelCreator] for this source, which can be used to adjust the creation behavior.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelsSource%23labelCreator">Online Documentation</a>
   */
  final var labelCreator: LabelCreator<TDataItem>
  
  companion object : ClassMetadata<LabelsSource<*>> {
  }
}
