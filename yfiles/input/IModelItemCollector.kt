// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IModelItem
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface that allows input modes to collect [IModelItem]s for various purposes.
 * @see [HandleInputMode.affectedItems]
 * @see [MoveInputMode.affectedItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IModelItemCollector">Online Documentation</a>
 */
external interface IModelItemCollector : YObject {
/**
 * Adds a model item to this collector instance.
 * @param [item] The model item to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IModelItemCollector%23IModelItemCollector-method-add">Online Documentation</a>
 */
   fun add( item: IModelItem )

/**
 * Adds a model item to this collector instance.
 * @param [item] The model item to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IModelItemCollector%23IModelItemCollector-method-add">Online Documentation</a>
 */
@JsName("add")
  final operator fun plusAssign( item: IModelItem ):Unit = definedExternally

companion object : InterfaceMetadata<IModelItemCollector> {
}
}
