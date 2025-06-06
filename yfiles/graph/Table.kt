// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IContextLookup
import yfiles.collections.IEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.IRectangle
import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IClassMetadata
import yfiles.lang.ICloneable
import yfiles.styles.ILabelStyle
import yfiles.styles.IStripeStyle

/**
 * Default implementation of the [ITable] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table">Online Documentation</a>
 * 
 * @constructor Default constructor that creates an empty table
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-constructor-Table">Online Documentation</a>
 */
open external class Table () : ITable, ICloneable<Table> {
  /**
   * Gets or sets the defaults for Columns.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23columnDefaults">Online Documentation</a>
   */
  final override var columnDefaults: IStripeDefaults
  
  /**
   * Gets the top-level [IColumn]s in this table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23columns">Online Documentation</a>
   */
  final val columns: IEnumerable<IColumn>
  
  /**
   * Gets the layout of the table, relative to an owner node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23layout">Online Documentation</a>
   */
  final override val layout: IRectangle
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23padding">Online Documentation</a>
   */
  final override var padding: Insets
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23rootColumn">Online Documentation</a>
   */
  final override val rootColumn: IColumn
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23rootRow">Online Documentation</a>
   */
  final override val rootRow: IRow
  
  /**
   * Gets or sets the defaults for rows.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23rowDefaults">Online Documentation</a>
   */
  final override var rowDefaults: IStripeDefaults
  
  /**
   * Gets the top-level [IRow]s in this table.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23rows">Online Documentation</a>
   */
  final val rows: IEnumerable<IRow>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-addLabel">Online Documentation</a>
   */
  override fun addLabel(
    owner: IStripe,
    text: String,
    layoutParameter: ILabelModelParameter?,
    style: ILabelStyle?,
    preferredSize: Size?,
    tag: Tag?,
  ): ILabel
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-clone">Online Documentation</a>
   */
  override fun clone(): Table
  
  /**
   * Called during [clone][Table] to create a copy of `column`.
   * @param [column] The column that should be copied during a clone operation.
   * @return A clone of `column` if possible. Otherwise, the original reference to `column`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-copyColumn">Online Documentation</a>
   */
  protected open fun copyColumn(
    column: IColumn,
  ): IColumn
  
  /**
   * Called during [clone][Table] to create a copy of `originalDefaults`
   * @param [originalDefaults] The default settings that should be copied during a clone operation.
   * @return The original reference to `originalDefaults`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-copyDefaults">Online Documentation</a>
   */
  protected open fun copyDefaults(
    originalDefaults: IStripeDefaults,
  ): IStripeDefaults
  
  /**
   * Called during [clone][Table] to create a copy of `row`.
   * @param [row] The row that should be copied during a clone operation.
   * @return A clone of `row` if possible. Otherwise, the original reference to `row`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-copyRow">Online Documentation</a>
   */
  protected open fun copyRow(
    row: IRow,
  ): IRow
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-createChildColumn">Online Documentation</a>
   */
  override fun createChildColumn(
    parent: IColumn?,
    width: Double,
    minWidth: Double,
    padding: Insets,
    style: IStripeStyle,
    tag: Tag?,
    index: Int?,
  ): IColumn
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-createChildRow">Online Documentation</a>
   */
  override fun createChildRow(
    parent: IRow?,
    height: Double,
    minHeight: Double,
    padding: Insets,
    style: IStripeStyle,
    tag: Tag?,
    index: Int?,
  ): IRow
  
  /**
   * Creates the Column defaults.
   * @return A new instance of the [StripeDefaults] class which is used for [newly created columns][Table].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-createColumnDefaults">Online Documentation</a>
   */
  protected open fun createColumnDefaults(): IStripeDefaults
  
  /**
   * Creates the row defaults.
   * @return A new instance of the [StripeDefaults] class that is used for [newly created rows][Table].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-createRowDefaults">Online Documentation</a>
   */
  protected open fun createRowDefaults(): IStripeDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Called after a label has been added to a stripe.
   * @param [label] The label that has just been added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    label: ILabel,
  )
  
  /**
   * Called after a label has changed.
   * @param [label] The label that has changed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onLabelChanged">Online Documentation</a>
   */
  protected open fun onLabelChanged(
    label: ILabel,
  )
  
  /**
   * Called after a label has been removed from its stripe.
   * @param [owner] The old owner of the label.
   * @param [label] The label that has just been removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onLabelRemoved">Online Documentation</a>
   */
  protected open fun onLabelRemoved(
    owner: ILabelOwner,
    label: ILabel,
  )
  
  /**
   * Called after a stripe has changed.
   * @param [owner] The original owner
   * @param [stripe] The stripe that has changed.
   * @param [oldTable] The original table owner, in case the stripe has been moved between different table instances
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onStripeChanged">Online Documentation</a>
   */
  protected open fun onStripeChanged(
    owner: IStripe,
    stripe: IStripe,
    oldTable: ITable,
  )
  
  /**
   * Called after a stripe has been created and added to a table.
   * @param [stripe] The stripe that has just been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onStripeCreated">Online Documentation</a>
   */
  protected open fun onStripeCreated(
    stripe: IStripe,
  )
  
  /**
   * Called after a stripe has been removed from its owner.
   * @param [owner] The old owner of the stripe.
   * @param [stripe] The stripe that has just been removed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-onStripeRemoved">Online Documentation</a>
   */
  protected open fun onStripeRemoved(
    owner: IStripe,
    stripe: IStripe,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-remove">Online Documentation</a>
   */
  override fun remove(
    stripe: IStripe,
  )
  
  /**
   * Removes the given label from its owner.
   * @param [label] The label to remove
   * @throws ArgumentError If the label is not associated with this table instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-remove">Online Documentation</a>
   */
  override fun remove(
    label: ILabel,
  )
  
  /**
   * Sets the label model parameter for the given label.
   * @param [label] The label.
   * @param [layoutParameter] The new parameter.
   * @throws ArgumentError If the parameter cannot be used for this label or if the label is not associated with this table instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setLabelLayoutParameter">Online Documentation</a>
   */
  override fun setLabelLayoutParameter(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  )
  
  /**
   * Sets the preferred size of the label.
   * @param [label] The label.
   * @param [preferredSize] The new preferred size.
   * @throws ArgumentError If the label is not associated with this table instance.
   * @see [ILabel.preferredSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setLabelPreferredSize">Online Documentation</a>
   */
  override fun setLabelPreferredSize(
    label: ILabel,
    preferredSize: Size,
  )
  
  /**
   * Sets the label text of the given label.
   * @param [label] The label to modify
   * @param [text] The new text of the label
   * @throws ArgumentError If the label is not associated with this table instance.
   * @see [ILabel.text]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setLabelText">Online Documentation</a>
   */
  override fun setLabelText(
    label: ILabel,
    text: String,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setMinimumSize">Online Documentation</a>
   */
  override fun setMinimumSize(
    stripe: IStripe,
    minimumSize: Double,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setParent">Online Documentation</a>
   */
  override fun setParent(
    parent: IRow,
    row: IRow,
    index: Int?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setParent">Online Documentation</a>
   */
  override fun setParent(
    parent: IColumn,
    column: IColumn,
    index: Int?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setSize">Online Documentation</a>
   */
  override fun setSize(
    stripe: IStripe,
    size: Int,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setStripePadding">Online Documentation</a>
   */
  override fun setStripePadding(
    stripe: IStripe,
    padding: Insets,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    stripe: IStripe,
    style: IStripeStyle,
  )
  
  /**
   * Assigns the given style instance by reference to the label.
   * @param [label] The label that will be assigned the new style
   * @param [style] The style instance that will be assigned to the label.
   * @throws ArgumentError If the label is not associated with this table instance.
   * @see [ILabel.style]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    label: ILabel,
    style: ILabelStyle,
  )
  
  companion object : ClassMetadata<Table> {
    /**
     * Gets an [IContextLookup] that provides the default implementations returned by an [IColumn]'s lookup.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23DEFAULT_COLUMN_LOOKUP">Online Documentation</a>
     */
     val DEFAULT_COLUMN_LOOKUP: IContextLookup<*>
    
    /**
     * Gets an [IContextLookup] that provides the default implementations returned by an [IRow]'s lookup.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23DEFAULT_ROW_LOOKUP">Online Documentation</a>
     */
     val DEFAULT_ROW_LOOKUP: IContextLookup<*>
    
    /**
     * Gets an [IContextLookup] that provides the default implementations returned by an [IStripe]'s lookup.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23DEFAULT_STRIPE_LOOKUP">Online Documentation</a>
     */
     val DEFAULT_STRIPE_LOOKUP: IContextLookup<*>
    
    /**
     * Installs the undo support for use with all tables that are bound to nodes in `graph`.
     * @receiver The graph where the nodes exist or will be created/changed and where the undo support should come from.
     * @see [uninstallDynamicUndoSupport]
     * @see [installStaticUndoSupport]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-installDynamicUndoSupport">Online Documentation</a>
     */
    fun IGraph.installDynamicUndoSupport()
    
    /**
     * Installs the undo support for use with all tables that are bound to nodes in `graph`.
     * @receiver The graph where the nodes exist or will be created/changed.
     * @see [uninstallStaticUndoSupport]
     * @see [installDynamicUndoSupport]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-installStaticUndoSupport">Online Documentation</a>
     */
    fun IGraph.installStaticUndoSupport()
    
    /**
     * Uninstalls the undo support that has previously been installed with [installDynamicUndoSupport][Table]
     * @receiver The graph where the tables are installed for which the undo support should be cleared.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-uninstallDynamicUndoSupport">Online Documentation</a>
     */
    fun IGraph.uninstallDynamicUndoSupport()
    
    /**
     * Uninstalls the undo support that has previously been installed with [installStaticUndoSupport][Table]
     * @receiver The graph where the tables are installed for which the undo support should be cleared.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23Table-method-uninstallStaticUndoSupport">Online Documentation</a>
     */
    fun IGraph.uninstallStaticUndoSupport()
  }
}

inline fun Table(
    block: Table.() -> Unit
): Table {
    return Table()
        .apply(block)
}

/**
 * `stripe-created`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23stripe-created">Online Documentation</a>
 */
inline fun  Table.addStripeCreatedHandler(
  crossinline handler: (item:IStripe) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IStripe>> = { event, _ -> handler(event.item) }
  addEventListener("stripe-created", listener)
  return { removeEventListener("stripe-created", listener) }
}

/**
 * `stripe-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23stripe-removed">Online Documentation</a>
 */
inline fun  Table.addStripeRemovedHandler(
  crossinline handler: (event:StripeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<StripeEventArgs> = { event, _ -> handler(event) }
  addEventListener("stripe-removed", listener)
  return { removeEventListener("stripe-removed", listener) }
}

/**
 * `stripe-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23stripe-changed">Online Documentation</a>
 */
inline fun  Table.addStripeChangedHandler(
  crossinline handler: (event:StripeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<StripeEventArgs> = { event, _ -> handler(event) }
  addEventListener("stripe-changed", listener)
  return { removeEventListener("stripe-changed", listener) }
}

/**
 * `label-added`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23label-added">Online Documentation</a>
 */
inline fun  Table.addLabelAddedHandler(
  crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<ILabel>> = { event, _ -> handler(event.item) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}

/**
 * `label-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23label-removed">Online Documentation</a>
 */
inline fun  Table.addLabelRemovedHandler(
  crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<LabelEventArgs> = { event, _ -> handler(event) }
  addEventListener("label-removed", listener)
  return { removeEventListener("label-removed", listener) }
}

/**
 * `label-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Table%23label-changed">Online Documentation</a>
 */
inline fun  Table.addLabelChangedHandler(
  crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<ILabel>> = { event, _ -> handler(event.item) }
  addEventListener("label-changed", listener)
  return { removeEventListener("label-changed", listener) }
}
