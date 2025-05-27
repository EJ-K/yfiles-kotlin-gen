// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IObservableCollection
import yfiles.lang.ClassMetadata
import yfiles.lang.IClassMetadata

/**
 * An [ItemModelManager] that automatically installs and removes visual representations of items in a [IObservableCollection] into or from the canvas.
 * @param [T] The type of items in the observable collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new instance using the given `model`.
 * @param [itemType] The type of items in the observable collection.
 * @param [model] The model to manage.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-constructor-CollectionModelManager(Constructor,IObservableCollection)">Online Documentation</a>
 * 
 * @property model
 * Gets or sets the model of the items to display in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23model">Online Documentation</a>
 */
open external class CollectionModelManager<T> (
itemType: IClassMetadata<T>,
final var model: IObservableCollection<T>? = definedExternally) : ItemModelManager<T> {
  /**
   * Gets or sets a value indicating whether this [CollectionModelManager] is enabled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23enabled">Online Documentation</a>
   */
  final var enabled: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-addItem">Online Documentation</a>
   */
  override fun addItem(
    item: T,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-getItem">Online Documentation</a>
   */
  override fun getItem(
    renderTreeElement: IRenderTreeElement,
  ): T?
  
  /**
   * Called when this mode gets [disabled][CollectionModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-onDisabled">Online Documentation</a>
   */
  protected open fun onDisabled()
  
  /**
   * Called when this mode gets [enabled][CollectionModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-onEnabled">Online Documentation</a>
   */
  protected open fun onEnabled()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-removeItem">Online Documentation</a>
   */
  override fun removeItem(
    item: T,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CollectionModelManager%23CollectionModelManager-method-update">Online Documentation</a>
   */
  override fun update(
    item: T,
  )
  
  companion object : ClassMetadata<CollectionModelManager<*>> {
  }
}
