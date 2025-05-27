// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.graph.ITable
import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventArgs
import yfiles.lang.PropertyChangedEventHandler

/**
 * An [INodeStyle] for [tables][ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle">Online Documentation</a>
 * 
 * @constructor Constructor with a custom renderer implementation that uses `table` as backing table model.
 * @param [table] The table instance that defines the tabular structure.
 * @param [renderer] Custom renderer instance for this style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-constructor-TableNodeStyle">Online Documentation</a>
 * 
 * @property table
 * Gets or sets the [ITable] instance that defines the tabular structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23table">Online Documentation</a>
 * 
 * @property renderer
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23renderer">Online Documentation</a>
 */
external open class TableNodeStyle  (
final var table: ITable = definedExternally,
final override val renderer: TableNodeStyleRenderer = definedExternally) : INodeStyle, IPropertyObservable {

/**
 * Gets or sets the style that is used to draw the background of the table.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23backgroundStyle">Online Documentation</a>
 */
final var backgroundStyle: INodeStyle?
/**
 * Gets or sets the order in which rows and columns are rendered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23tableRenderingOrder">Online Documentation</a>
 */
final var tableRenderingOrder: TableRenderingOrder
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-method-clone">Online Documentation</a>
 */
 override   fun clone():TableNodeStyle
/**
 * Create a copy of the background style when this style instance is cloned
 * @param [style] The original background node style
 * @return This implementation always returns the original `style` instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-method-copyBackgroundStyle">Online Documentation</a>
 */
 open protected   fun copyBackgroundStyle( style: INodeStyle? ):INodeStyle?
/**
 * Create a copy of the table when this style instance is cloned
 * @param [table] The original table instance
 * @return This implementation always tries to [ICloneable.clone][yfiles.lang.ICloneable.clone] clone the original `table` instance, if possible, otherwise it returns `table` unchanged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-method-copyTable">Online Documentation</a>
 */
 open protected   fun copyTable( table: ITable ):ITable
/**
 * Raises the [PropertyChanged] event.
 * @param [event] The [PropertyChangedEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23TableNodeStyle-method-onPropertyChanged">Online Documentation</a>
 */
 open protected   fun onPropertyChanged( event: PropertyChangedEventArgs )
/**
 * Occurs when the value of the [table] property changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TableNodeStyle%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<TableNodeStyle> {
}
}

inline fun TableNodeStyle(
    block: TableNodeStyle.() -> Unit
): TableNodeStyle {
    return TableNodeStyle()
        .apply(block)
}
