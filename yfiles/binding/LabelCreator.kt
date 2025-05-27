// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.geometry.Size
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelDefaults
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.YObject
import yfiles.styles.ILabelStyle

/**
 * This class can be used to create and update [ILabel]s based on data items.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator">Online Documentation</a>
 * 
 * @constructor Creates a new creator for labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-constructor-LabelCreator">Online Documentation</a>
 */
external open class LabelCreator<TDataItem>  () : YObject, IEventDispatcher {

/**
 * Gets or sets a set of [ILabelDefaults] that will be used for the labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23defaults">Online Documentation</a>
 */
final var defaults: ILabelDefaults
/**
 * Gets or sets an optional provider of a label model parameter that will be used as the label's [ILabel.layoutParameter] for the source data item.
 * @see [getLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23layoutParameterProvider">Online Documentation</a>
 */
final var layoutParameterProvider: Provider<TDataItem, ILabelModelParameter>?
/**
 * Gets or sets an optional binding that will be [applied][applyPreferredSizeBindings] to the label.
 * @see [applyPreferredSizeBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23preferredSizeBindings">Online Documentation</a>
 */
final var preferredSizeBindings: ObjectBindings<TDataItem>
/**
 * Gets or sets an optional provider of the size that will be used as the label's [ILabel.preferredSize] for the source data item.
 * @see [getPreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23preferredSizeProvider">Online Documentation</a>
 */
final var preferredSizeProvider: Provider<TDataItem, Size>?
/**
 * Gets or sets an optional set of bindings that will be [applied][applyStyleBindings] to the label's [ILabel.style].
 * @see [applyStyleBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23styleBindings">Online Documentation</a>
 */
final var styleBindings: ObjectBindings<TDataItem>
/**
 * Gets or sets an optional provider of an [ILabelStyle] instance that will be used as the label's [ILabel.style] for the source data item.
 * 
 * By default the [defaults]' [ILabelDefaults.style] will be used. Note that [ILabelDefaults.shareStyleInstance] will be ignored if this provider returns a value. Use the [styleBindings] to reconfigure properties of the style instances.
 * @see [getStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23styleProvider">Online Documentation</a>
 */
final var styleProvider: Provider<TDataItem, ILabelStyle>?
/**
 * Gets or sets an optional provider of an object that will be used as the label's [ITagOwner.tag][yfiles.graph.ITagOwner.tag] for the source data item.
 * 
 * By default the source data item itself will be used as the tag.
 * @see [getTag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23tagProvider">Online Documentation</a>
 */
final var tagProvider: Provider<TDataItem, Any>?
/**
 * Gets or sets an optional provider of the text that will be used as the label's [ILabel.text] for the source data item.
 * @see [getText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23textProvider">Online Documentation</a>
 */
final var textProvider: Provider<TDataItem, String>?
/**
 * Adds a label on the given [ILabelOwner] with the values of the bindings resolved against the `dataItem`.
 * @param [graph] The graph.
 * @param [owner] The owner to which the label should be added.
 * @param [dataItem] The data item for which to create the label.
 * @return The newly added label.
 * @see [getLayoutParameter]
 * @see [getPreferredSize]
 * @see [getText]
 * @see [getStyle]
 * @see [getTag]
 * @see [applyPreferredSizeBindings]
 * @see [applyStyleBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-addLabel">Online Documentation</a>
 */
 open   fun addLabel( graph: IGraph ,
 owner: ILabelOwner ,
 dataItem: TDataItem ):ILabel?
/**
 * Called from [addLabel] and performs the actual label creation in the graph.
 * @param [graph] The graph to create the node in.
 * @param [owner] The owner to which the label should be added.
 * @param [text] The label's text.
 * @param [layoutParameter] The layout parameter of the label.
 * @param [style] The style of the label.
 * @param [preferredSize] The preferred size of the label.
 * @param [tag] The tag of the node.
 * @return The newly added label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-addLabelCore">Online Documentation</a>
 */
 open protected   fun addLabelCore( graph: IGraph ,
 owner: ILabelOwner ,
 text: String ,
 layoutParameter: ILabelModelParameter ,
 style: ILabelStyle ,
 preferredSize: Size? ,
 tag: Tag? ):ILabel
/**
 * Resolves the [preferredSizeBindings] against the given `dataItem` and applies them to the given `label` preferredSize.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used.
 * @see [updatePreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-applyPreferredSizeBindings">Online Documentation</a>
 */
 final   fun applyPreferredSizeBindings( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Resolves the [styleBindings] against the given `dataItem` and applies them to the given `label` style.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used.
 * @see [updateStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-applyStyleBindings">Online Documentation</a>
 */
 final   fun applyStyleBindings( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Obtains a [ILabel.layoutParameter] instance or `null` by resolving [layoutParameterProvider] on the data item.
 * @param [dataItem] The data item on which the provider is resolved.
 * @return The value to use or `null` in case the defaults should be used.
 * @see [layoutParameterProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getLayoutParameter">Online Documentation</a>
 */
 open protected   fun getLayoutParameter( dataItem: TDataItem ):ILabelModelParameter?
/**
 * Obtains a [ILabel.preferredSize] or `null` by resolving the [preferredSizeProvider] on the data item.
 * @param [dataItem] The data item on which the provider is resolved.
 * @return The value to use or `null` in case the defaults should be used.
 * @see [preferredSizeProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getPreferredSize">Online Documentation</a>
 */
 open protected   fun getPreferredSize( dataItem: TDataItem ):Size?
/**
 * Obtains an [ILabelStyle] instance or `null` by resolving the [styleProvider].
 * @param [dataItem] The data item on which the provider is resolved.
 * @return The value to use or `null` in case the defaults should be used.
 * @see [styleProvider]
 * @see [styleBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getStyle">Online Documentation</a>
 */
 open protected   fun getStyle( dataItem: TDataItem ):ILabelStyle?
/**
 * Obtains an `object` to use as [ITagOwner.tag][yfiles.graph.ITagOwner.tag] by resolving the [tagProvider] on the data item.
 * @param [dataItem] The data item on which the provider is resolved.
 * @return The value to use or `null` in case the defaults should be used.
 * @see [tagProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getTag">Online Documentation</a>
 */
 open protected   fun getTag( dataItem: TDataItem ):Any?
/**
 * Obtains a `string` to use as [ILabel.text] or `null` by resolving the [textProvider] on the data item.
 * @param [dataItem] The data item on which the provider is resolved.
 * @return The value to use or `null` in case no text should be added.
 * @see [textProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getText">Online Documentation</a>
 */
 open protected   fun getText( dataItem: TDataItem ):String?
/**
 * Resolves the [layoutParameterProvider] on the given data item.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used.
 * @return The new layout parameter instance. Either the value returned by [getLayoutParameter], or the [default layout parameter][defaults], if [getLayoutParameter] returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedLayoutParameter">Online Documentation</a>
 */
 open protected   fun getUpdatedLayoutParameter( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):ILabelModelParameter
/**
 * Resolves the [preferredSizeProvider] and then [applies the preferred size bindings][applyPreferredSizeBindings].
 * @param [graph] The managed graph.
 * @param [label] The label for which the size should be updated.
 * @param [dataItem] The data item that is used.
 * @return Returns the label's new preferred size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedPreferredSize">Online Documentation</a>
 */
 open protected   fun getUpdatedPreferredSize( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):Size
/**
 * Resolves the [styleProvider] and then [applies the style bindings][applyStyleBindings].
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used.
 * @return The updated style instance. Either the value returned by [getStyle], or the [default style][defaults], if [getStyle] returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedStyle">Online Documentation</a>
 */
 open protected   fun getUpdatedStyle( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):ILabelStyle
/**
 * Resolves the [tagProvider] on the given data item.
 * @param [graph] The managed graph.
 * @param [label] The label for which the new tag should be obtained.
 * @param [dataItem] The data item that is used.
 * @return Returns the updated tag object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedTag">Online Documentation</a>
 */
 open protected   fun getUpdatedTag( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):Any?
/**
 * Resolves the [textProvider] on the given data item.
 * @param [graph] The managed graph.
 * @param [label] The label for which the new text should be obtained.
 * @param [dataItem] The data item that is used.
 * @return Returns the new text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-getUpdatedText">Online Documentation</a>
 */
 open protected   fun getUpdatedText( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):String
/**
 * Triggers the [LabelAdded] event.
 * @param [graph] The graph in which the label has been added.
 * @param [dataItem] The data item from which the label has been created.
 * @param [label] The label that has been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( graph: IGraph ,
 dataItem: TDataItem ,
 label: ILabel )
/**
 * Triggers the [LabelUpdated] event.
 * @param [graph] The graph in which the label has been updated.
 * @param [dataItem] The data item with which the label has been updated.
 * @param [label] The label that has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-onLabelUpdated">Online Documentation</a>
 */
 open protected   fun onLabelUpdated( graph: IGraph ,
 dataItem: TDataItem ,
 label: ILabel )
/**
 * Updates the label.
 * @param [graph] The graph that contains the edge.
 * @param [label] The label to update.
 * @param [dataItem] The data item with which the label should be updated.
 * @return `true` if the label has been updated. If `false` the label information has been removed from `dataItem` and therefore the label will be removed, too.
 * @see [updateLayoutParameter]
 * @see [updatePreferredSize]
 * @see [updateStyle]
 * @see [updateText]
 * @see [updateTag]
 * @see [applyStyleBindings]
 * @see [applyPreferredSizeBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateLabel">Online Documentation</a>
 */
 open   fun updateLabel( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem ):Boolean
/**
 * Updates the [ILabel.layoutParameter] of the `label` with the given `dataItem` by calling [getUpdatedLayoutParameter] and setting the new parameter on the label.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used for the update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateLayoutParameter">Online Documentation</a>
 */
 final   fun updateLayoutParameter( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Updates the [ILabel.preferredSize] of the `label` with the given `dataItem` by calling [getUpdatedPreferredSize] and setting the new size on the label.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used for the update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updatePreferredSize">Online Documentation</a>
 */
 final   fun updatePreferredSize( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Updates the style of the `label` with the given `dataItem` by calling [getUpdatedStyle] and applying the style to the node in the graph.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used for the update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateStyle">Online Documentation</a>
 */
 final   fun updateStyle( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Updates the [ITagOwner.tag][yfiles.graph.ITagOwner.tag] of the `label` with the given `dataItem` by calling [getUpdatedTag] and setting the new `tag` on the label.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used for the update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateTag">Online Documentation</a>
 */
 final   fun updateTag( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Updates the [ILabel.text] of the `label` with the given `dataItem` by calling [getUpdatedText] and setting the new text on the label.
 * @param [graph] The managed graph.
 * @param [label] The label to update.
 * @param [dataItem] The data item that is used for the update.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelCreator-method-updateText">Online Documentation</a>
 */
 final   fun updateText( graph: IGraph ,
 label: ILabel ,
 dataItem: TDataItem )
/**
 * Occurs when a label has been added.
 * @see [addLabelUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>>)
fun removeLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>>)

/**
 * Occurs when a label has been updated.
 * @see [addLabelAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelUpdated">Online Documentation</a>
 */
fun addLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>>)
fun removeLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>>)

companion object : ClassMetadata<LabelCreator<*>> {
}
}

/**
 * Occurs when a label has been added.
 * @see [addLabelUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelAdded">Online Documentation</a>
 */
inline fun <TDataItem> LabelCreator<TDataItem>.addLabelAddedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, TDataItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>> = { _, event -> handler(event) }
    addLabelAddedListener(listener)
    return { removeLabelAddedListener(listener) }
}
/**
 * Occurs when a label has been updated.
 * @see [addLabelAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCreator%23LabelUpdated">Online Documentation</a>
 */
inline fun <TDataItem> LabelCreator<TDataItem>.addLabelUpdatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, TDataItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, TDataItem>> = { _, event -> handler(event) }
    addLabelUpdatedListener(listener)
    return { removeLabelUpdatedListener(listener) }
}
