// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies;

/**
 * 
 */
public class Entity_2
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject entity_2MendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestSuite.Entity_2";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Entity_2_Color("TestSuite.Entity_2_Color");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Entity_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestSuite.Entity_2"));
	}

	protected Entity_2(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject entity_2MendixObject)
	{
		if (entity_2MendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestSuite.Entity_2", entity_2MendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestSuite.Entity_2");

		this.entity_2MendixObject = entity_2MendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Entity_2.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testsuite.proxies.Entity_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testsuite.proxies.Entity_2.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testsuite.proxies.Entity_2 initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testsuite.proxies.Entity_2(context, mendixObject);
	}

	public static testsuite.proxies.Entity_2 load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testsuite.proxies.Entity_2.initialize(context, mendixObject);
	}

	public static java.util.List<testsuite.proxies.Entity_2> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testsuite.proxies.Entity_2> result = new java.util.ArrayList<testsuite.proxies.Entity_2>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestSuite.Entity_2" + xpathConstraint))
			result.add(testsuite.proxies.Entity_2.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Entity_2_Color
	 */
	public final testsuite.proxies.Color getEntity_2_Color() throws com.mendix.core.CoreException
	{
		return getEntity_2_Color(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity_2_Color
	 */
	public final testsuite.proxies.Color getEntity_2_Color(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		testsuite.proxies.Color result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Entity_2_Color.toString());
		if (identifier != null)
			result = testsuite.proxies.Color.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Entity_2_Color
	 * @param entity_2_color
	 */
	public final void setEntity_2_Color(testsuite.proxies.Color entity_2_color)
	{
		setEntity_2_Color(getContext(), entity_2_color);
	}

	/**
	 * Set value of Entity_2_Color
	 * @param context
	 * @param entity_2_color
	 */
	public final void setEntity_2_Color(com.mendix.systemwideinterfaces.core.IContext context, testsuite.proxies.Color entity_2_color)
	{
		if (entity_2_color == null)
			getMendixObject().setValue(context, MemberNames.Entity_2_Color.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Entity_2_Color.toString(), entity_2_color.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return entity_2MendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testsuite.proxies.Entity_2 that = (testsuite.proxies.Entity_2) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestSuite.Entity_2";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
